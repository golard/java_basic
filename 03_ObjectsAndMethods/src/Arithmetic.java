 public class Arithmetic
{

    int number1 = 0;
    int number2 = 0;
    int summ;
    int multi;
    int average;
    int substractionNumber1;
    int substractionNumber2;


    public void Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //addition
    public int summ(int number1, int number2) {
       summ = number1 + number2;
       return summ;
    }

    //difference with a result > 0
    public int dif(int number1, int number2) {
        if(number1 > number2) {
            substractionNumber1 = number1 - number2;
            return substractionNumber1;
        }
        else{
            substractionNumber2 = number2 - number1;
            return substractionNumber2;
        }
    }

    //multiplication
    public int multi (int number1, int number2) {
        multi = number1 * number2;
        return multi;
    }

    //average number
    public int average (int number1, int number2) {
        average = (number1 * number2) / 2;
        return average;
    }

    //max number
    public int max (int number1, int number2) {
        if(number1 > number2) {
            return number1;
        }
        else {
            return number2;
        }
    }

    //min number
    public int min (int number1, int number2) {
        if(number1 < number1) {
            return number1;
        }
        else{
            return number2;
        }
    }
}
