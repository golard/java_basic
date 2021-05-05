import org.w3c.dom.ls.LSOutput;

class Arithmetic {

    int number1 = 0;
    int number2 = 0;


    public void Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //addition
    public void Sum(int sum) {
       sum = number1 + number2;
       System.out.println("Сумма чисел равна: " + sum);
    }

    //difference with a result > 0
    public  void Dif(int dif) {
        if(number1 > number2) {
            dif = number1 - number2;
        }
        else{
            dif = number2 - number1;
        }
        System.out.println("Разность чисел равна: " + dif);
    }

    //multiplication
    public void Multi (int multi) {
        multi = number1 * number2;
        System.out.println("Произведение чисел равно: " + multi);
    }

    //average nummber
    public void AverageNummber (int average) {
        average = (number1 * number2) / 2;
        System.out.println("Среднее значение чисел равно: " + average);
    }

    //max nummber
    public void MaxNummber (int max) {
        if(number1 > number2) {
            max = number1;
        }
        else {
            max = number2;
        }
        System.out.println("Максимальное из двух чисел число: " + max);
    }

    //min nummber
    public void MinNummber (int min) {
        if(number1 < number1) {
            min = number1;
        }
        else{
            min = number2;
        }
        System.out.println("Минимальное из двух чисел: " + min);
    }
}
