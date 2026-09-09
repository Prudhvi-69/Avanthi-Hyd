#include<stdio.h>
void main()
{
	int a = 11;
	int b = 12;
	printf("\n Values before swap : %d and %d ",a,b);
	int c = b;
	b = a;
	a = c;
	printf("\n Values after swap : %d and %d ",a,b);	
}


//#include<stdio.h>
//void main()
//{
//	int age;
//	float cgpa;
//	char gender;
//	scanf("%d",&age);
//	scanf("%f",&cgpa);
//	scanf(" %c",&gender);
//	printf("\n Age is : %d ",age);
//	printf("\n CGPA is : %.1f ",cgpa);	
////If you want to display the float value with only specific point values,
////You can use the concept of limiting the precision values in it using 
//// %.2f for showing 2 floating decimal values.	
//	printf("\n Gender is : %c ",gender);	
//}

