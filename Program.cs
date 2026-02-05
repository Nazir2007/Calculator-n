class Program
{
    static void Main(string[] args)
    {
        System.Console.WriteLine("Welcome to the Calculator-n");
        System.Console.WriteLine("Enter the first number:");
        double num1 = Convert.ToDouble(System.Console.ReadLine());
        System.Console.WriteLine("Enter the second number:");
        double num2 = Convert.ToDouble(System.Console.ReadLine());
        System.Console.WriteLine("Select an operation (+, -, *, /):");
        string operation = System.Console.ReadLine();
        double result = 0;
        switch (operation)
        {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0)
                {
                    result = num1 / num2;
                }
                else
                {
                    System.Console.WriteLine("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.Console.WriteLine("Error: Invalid operation selected.");
                return;
        }
        System.Console.WriteLine($"The result is: {result}");
        
    }
    
}