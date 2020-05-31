#include<iostream>
int main()
{
  int a,fact=1;
  std::cin>>a;
  for(int i=a;i>0;i--)
  {
    fact=fact*i;
  }
  std::cout<<"The factorial of "<<a<<" is "<<fact;
}