#!/bin/bash

# 获取时间
if [ $# -eq 1 ]
then
    date=$1
    if [ ${#date} -ne 8 ]
    then
        echo "Usage: $0 [1]YYYYMMDD"
        exit -1
    fi
else
   date=`date "-v-24H" +"%Y%m%d"`
fi
echo "[INFO] ${date}"

file_name="$date"_计划.md
touch $file_name


lineNum=`cat ../JVM学习计划.md | grep "\- " | wc -l`
echo $lineNum

seLineNum=0
for line in `cat ../JVM学习计划.md`
do
	if [[ "$line" == *"-"* ]]; then
		seLineNum=`expr $seLineNum + 1`
	fi
done

echo $seLineNum
