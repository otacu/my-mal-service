logstash就像一个定时任务

本例中，项目相关的es模板、mysql驱动、logstash配置文件等都放在logstash/mal-anime中

在bin目录启动  logstash -f ../mal-anime/logstash-mysql-es.conf

查看索引模板  http://localhost:9200/_template
删除指定模板  DELETE  http://localhost:9200/_template/index_mal_anime/

es模板字段名不要用关键字命名，例如type。

logstash局限性：可以记住最后一条记录的指定字段的值用于作为下次同步的开始界线，但是最后一条记录的指定字段不一定是最大的id或者是最新的时间，所以这个增量同步方案感觉很鸡肋。比较适合做全量同步,14291条数据只需44秒。