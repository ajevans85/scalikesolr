@echo off
cd %~dp0\..\solr\3.5.0\example\
java -jar -Djetty.port=8984 -Dsolr.data.dir=.\solr\data_shard start.jar
