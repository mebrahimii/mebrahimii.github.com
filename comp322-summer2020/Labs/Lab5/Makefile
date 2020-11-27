# To run, enter 
# make all

all: testpid

testpid: hm786348.o pid.o
	gcc  -lpthread -o testpid hm786348.o pid.o

pid.o: pid.c pid.h
	gcc -c pid.c

test.o: hm786348.c pid.h
	gcc -lpthread -c hm786348.c
