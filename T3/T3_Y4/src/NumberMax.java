public class NumberMax {
    int number1;
    int number2;
    int number3;
        int max (){
        int maxNumber = this.number1 > this.number2 ? this.number1 : this.number2;
        maxNumber = maxNumber > this.number3 ? maxNumber : this.number3;
        return maxNumber;
    }
}
