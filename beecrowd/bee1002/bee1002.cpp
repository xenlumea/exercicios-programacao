#include <iostream>
#include <iomanip>
#include <cmath>

int main()
{
    const double PI = 3.14159;

    double raio = 0;
    std::cin >> raio;

    double area = PI * pow(raio, 2);

    printf("A=%.4f\n", area);

    return 0;
}
