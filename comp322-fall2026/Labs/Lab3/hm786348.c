/**
 *
 * This program copies files using a pipe.
 *
 * Usage:
 *	filecopy <input file> <output file>
 */

#include <unistd.h>
#include <stdio.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <string.h>
#include <stdlib.h>
#include <time.h>

#define READ_END 0
#define WRITE_END 1

int main(int argc, char *argv[])
{
	int rv;
	pid_t pid;
	int c;
	char rb[128], wb[2];	/* bytes for reading/writing */
	int ffd[2];		/* file descriptor */
	int pipeffd[2];
	time_t currentTime;  

	/* Step1: Create pipe file descriptor */

	/* open the input file */
	ffd[0] = open(argv[1], O_RDONLY);
	
	if (ffd[0] < 0) {
		fprintf(stderr,"Unable to open %s\n",argv[1]);
		return 1;
	}
	
	/* open the output file */
	ffd[1] = open(argv[2], O_CREAT | O_RDWR, S_IRUSR | S_IWUSR);

	if (ffd[1] < 0) {
		fprintf(stderr,"Unable to open %s\n",argv[2]);

		/* close the input file */
		close(ffd[0]);

		return 1;
	}

	/* Step2: set up the pipe */
	/* make sure your program closes file handles*/
	
	pipe(pipeffd); 
	
	/* Step3: create the processes */
	/* read from the input file and write to the pipe */
	/* read from the pipe and write to the output file */
	
	pid = fork(); 
	
	// child process
	if(pid == 0)
	{	
		close(pipeffd[1]); 
		int i = 67;
		while(read(pipeffd[0],rb, sizeof(rb)) != 0)
		{				 
			write(ffd[1],rb,strlen(rb));
			currentTime = time(NULL);
			fprintf(stderr,"Write to file at: %s\n", asctime( localtime(&currentTime))); 
	
		}
		
		close(pipeffd[0]); 
		
		close(ffd[1]);
		
		exit(0); 
		 
	}
	// parent process
	else
	{
		close(pipeffd[0]);
		
		while(read(ffd[0],rb, sizeof(rb)) != 0)
		{	
			write(pipeffd[1],rb,sizeof(rb));		
			
		}
		
		close(pipeffd[1]); 
		
		close(ffd[0]);
		
		wait(NULL); 

		exit(0); 
				
	}
	
	
	return 0; 
	

}
