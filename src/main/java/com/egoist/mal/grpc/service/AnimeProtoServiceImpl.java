package com.egoist.mal.grpc.service;

import com.egoist.mal.elasticsearch.document.AnimeDoc;
import com.egoist.mal.elasticsearch.service.AnimeDocService;
import com.egoist.mal.grpc.generated.AnimeProto;
import com.egoist.mal.grpc.generated.AnimeProtoServiceGrpc;
import com.egoist.parent.pojo.dto.EgoistResult;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@GrpcService(AnimeProto.class)
public class AnimeProtoServiceImpl extends AnimeProtoServiceGrpc.AnimeProtoServiceImplBase {

    @Autowired
    private AnimeDocService animeDocService;

    /**
     * 从es搜索，封装和返回结果
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void search(AnimeProto.AnimeSearchRequest request, StreamObserver<AnimeProto.AnimeSearchResponse> responseObserver) {
        EgoistResult searchResult = animeDocService.search(request.getName(), request.getText());
        final AnimeProto.AnimeSearchResponse.Builder responseBuilder = AnimeProto.AnimeSearchResponse.newBuilder();
        responseBuilder.setStatus(searchResult.getStatus());
        responseBuilder.setMsg(searchResult.getMsg());
        if (EgoistResult.isOk(searchResult)) {
            List<AnimeDoc> animeDocList = (List<AnimeDoc>) searchResult.getData();
            for (int i=0;i<animeDocList.size();i++) {
                AnimeProto.AnimeData.Builder animeDataBuilder = AnimeProto.AnimeData.newBuilder();
                animeDataBuilder.setAnimeId(animeDocList.get(i).getAnimeId());
                animeDataBuilder.setEnName(animeDocList.get(i).getEnName());
                animeDataBuilder.setJpName(animeDocList.get(i).getJpName());
                animeDataBuilder.setPic(animeDocList.get(i).getPic());
                animeDataBuilder.setAnimeType(animeDocList.get(i).getAnimeType());
                animeDataBuilder.setEpisodes(animeDocList.get(i).getEpisodes());
                animeDataBuilder.setPremiered(animeDocList.get(i).getPremiered());
                animeDataBuilder.setProducers(animeDocList.get(i).getProducers());
                animeDataBuilder.setStudios(animeDocList.get(i).getStudios());
                animeDataBuilder.setSource(animeDocList.get(i).getSource());
                responseBuilder.addData(animeDataBuilder);
            }
        }
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

}
