#include <unistd.h>
#include <stdio.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <string.h>
#include <stdlib.h>

int main(int argc, char *argv[])
{
	FILE *input_fp = fopen(argv[1], "r");
	
	char buffer[6]; 
	
	int BUFFER_SIZE = 6; 
	
	int count = 0; 
	
	int toOffset = 4095; 
	
	int pageSize = 12; 
	
	if(input_fp == NULL)
	{
		exit(EXIT_FAILURE); 
	}
	
	printf("Address\tPage Number\tOffset\n"); 
	while(fgets(buffer, BUFFER_SIZE, input_fp) != NULL)
	{	
		unsigned long decimal = atol(buffer); 
		
		if(decimal == 0)
		{
			continue; 
		}
		
		unsigned long page = decimal; 
		
		unsigned long offset = decimal;  
		
		page = page >> pageSize; 
		
		offset = offset & toOffset; 
		
		printf("%lu\t\t%lu\t\t%lu\n",decimal,page,offset); 
		
		count++;
		
		
	}
	
	printf("Number of Translated Addresses: %d\n", count); 
	
	printf("***DONE***\n");
	
	return 0; 
}