#!/bin/sh

while :
do
  echo "----------------------------------------------------------------"
  date
  echo
  groovy DollarTest.groovy | grep -v "at "
  echo
  sleep 3
done
