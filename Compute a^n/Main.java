#include<iostream>
using namespace std;
int main()
{
  int a,n,c=1;
  std::cout<<"Enter the value of a";
  std::cin>>a;
  std::cout<<"\nEnter the value of n";
  std::cin>>n;
  if(n==0)
    std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<1;
  else
  {
    for(int i=1;i<=n;i++)
    {
      c=c*a;
    }
    std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<c;
  }
}