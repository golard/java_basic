 public class Arithmetic
{
    int number1 = 10;
    int number2 = 5;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    //addition
    public int summ() {
        return number1 + number2;
    }
    //difference with a result > 0
    public int dif() {
        if(number1 > number2) {
            return number1 - number2;
        }
        else{
            return number2 - number1;
        }
    }
    //multiplication
    public int multi () {
        return number1 * number2;
    }
    //average number
    public int average () {
        return (number1 + number2) / 2;
    }
    //max number
    public int max () {
        if(number1 > number2) {
            return number1;
        }
        else {
            return number2;
        }
    }
    //min number
    public int min () {
        if(number1 < number1) {
            return number1;
        }
        else{
            return number2;
        }
    }
}
