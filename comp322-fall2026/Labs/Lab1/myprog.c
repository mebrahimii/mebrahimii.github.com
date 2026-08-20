#include <stdio.h>
#include <unistd.h>
#include <errno.h>
#include <stdlib.h>
#include <time.h>
#include <pwd.h>

int main()
{
  register struct passwd *pw;
  register uid_t uid;
  uid = geteuid ();
  pw = getpwuid (uid);
  
  time_t mytime;
  mytime = time(NULL);
  
  printf("%s, Welcome to COMP 322 Lab!\n", pw->pw_name);
  printf("%s", ctime(&mytime));
  
  return 0;
}