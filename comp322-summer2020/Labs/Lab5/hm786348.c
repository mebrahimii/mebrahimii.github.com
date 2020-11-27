// File 1, pid.h
// This header file is included in pid.c and test.c

#include <pthread.h>

#define PID_MIN  	300
#define PID_MAX 	350

/* mutex lock for accessing pid_map */
pthread_mutex_t mutex;

extern int pid_map[PID_MAX-PID_MIN]; 

int last;	// last pid in use

//File 2, pid.c

#include "pid.h"
#include <pthread.h>
#include <stdio.h>
 
/**
 * Allocates the pid map.
 */
int allocate_map(void) 
{
	int i; 
	
	for(i = PID_MIN; i<PID_MAX; i++)
	{
		pid_map[i-PID_MIN] = 0; 
	}
	
	if(pid_map[0] != 0)
	{
		return -1; 
	}
	
	return 1; 
	
}

/**
 * Allocates a pid
 */
int allocate_pid(void)
{	
	int i; 
	
	for(i = PID_MIN;i<PID_MAX; i++)
	{
		if(pid_map[i - PID_MIN] == 0)
		{
			pid_map[i - PID_MIN] = 1; 	
			 
			return i; 
		}
	}
	return -1; 
}
/**
 * Releases a pid
 */
void release_pid(int pid)
{
	pid_map[pid - PID_MIN] = 0; 	
}

//File , hm786348.c 
#include <pthread.h>
#include <unistd.h>
#include <stdio.h>
#include <time.h>
#include "pid.h"

#define NUM_THREADS 100
#define ITERATIONS	10
#define SLEEP		1

int in_use[PID_MAX + 1];

/**
 * mutex lock used when accessing data structure
 * to ensure there are no duplicate pid's in use.
 */
pthread_mutex_t test_mutex;

int pid = -1; 

void *allocator(void *param)
{
	int x = (*(unsigned int*)param); 
	
	int timeToSleep = 1; 
	
	pthread_mutex_lock(&test_mutex);
	
	printf("Waiting %d seconds\n", timeToSleep); 
	
	sleep(timeToSleep); 
	
	pthread_mutex_unlock(&test_mutex);

	pthread_exit(0); 
}

int main(void)
{
	int i;
	pthread_t tids[NUM_THREADS];
	
	int storage [NUM_THREADS]; 

	int toSleep = SLEEP; 	

	//Todo:

	/* allocate the pid map */
	if (allocate_map() == -1)
		return -1;
	
	//Todo:
	
	pthread_mutex_init(&test_mutex, NULL); 

	int x = 0; 

	for(i = 0; i < NUM_THREADS;i++)
	{	
		x = 0; 

		while(x != 1)
		{	
			pid = allocate_pid(); 
			
			if(pid > 0)
			{
				x = 1; 
			}			
		
		}
		
		storage[i] = pid; 
				 			
		printf("Now using pid: %d\n", pid); 
		
		pthread_create(&tids[i], NULL, &allocator,&toSleep);
	
	}
	
	for(i = 0; i < NUM_THREADS; i++)
	{
		pthread_join(tids[i], NULL);
		
		pid = storage[i]; 
		
		release_pid(pid);
		
		printf("Releasing pid: %d\n", pid);
		
	}
	
	pthread_mutex_destroy(&test_mutex); 
	 
	printf("***DONE***\n");

	return 0;
}