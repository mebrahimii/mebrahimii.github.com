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
