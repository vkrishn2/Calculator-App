package pogilmogil.eecs40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView text;
    Button button,button2,button3,button4,button5,button6,button7,button8,button9, button10,
            button11,button12,button13,button14,button15,button16,button17,button18,button19;
    String temp_string;
    String temp_string2;
    String str_result;
    String get_char;
    CharSequence temp_char;
    Double temp_string_value;
    Double first_num;
    Double second_num;
    Double result = 0.00000;
    private static DecimalFormat dcformat = new DecimalFormat("#.######");
    int i, j;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.ScreenText);
        button = findViewById(R.id.buttonAC);
        button2 = findViewById(R.id.buttonDEL);
        button3 = findViewById(R.id.buttonMOD);
        button4 = findViewById(R.id.buttonDIV);
        button5 = findViewById(R.id.button7);
        button6 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button9);
        button8 = findViewById(R.id.buttonMULT);
        button9 = findViewById(R.id.button4);
        button10 = findViewById(R.id.button5);
        button11 = findViewById(R.id.button6);
        button12 = findViewById(R.id.buttonMIN);
        button13 = findViewById(R.id.button1);
        button14 = findViewById(R.id.button2);
        button15 = findViewById(R.id.button3);
        button16 = findViewById(R.id.buttonPLUS);
        button17 = findViewById(R.id.button0);
        button18 = findViewById(R.id.buttonDEC);
        button19 = findViewById(R.id.buttonEQUALS);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonAC:
                text.setText("");
                result = 0.0;
                break;
            case R.id.buttonDEL:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")){
                    break;
                }
                if(!temp_string.equals("")) {
                    temp_string = temp_string.substring(0, temp_string.length() - 1);
                    text.setText(temp_string);
                }
                break;
            case R.id.button0:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "0";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "0";
                    text.setText(temp_string);
                }
                break;
            case R.id.button1:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "1";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "1";
                    text.setText(temp_string);
                }
                break;
            case R.id.button2:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "2";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "2";
                    text.setText(temp_string);
                }
                break;
            case R.id.button3:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "3";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "3";
                    text.setText(temp_string);
                }
                break;
            case R.id.button4:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "4";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "4";
                    text.setText(temp_string);
                }
                break;
            case R.id.button5:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "5";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "5";
                    text.setText(temp_string);
                }
                break;
            case R.id.button6:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "6";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "6";
                    text.setText(temp_string);
                }
                break;
            case R.id.button7:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "7";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "7";
                    text.setText(temp_string);
                }
                break;
            case R.id.button8:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "8";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "8";
                    text.setText(temp_string);
                }
                break;
            case R.id.button9:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    temp_string = "9";
                    text.setText(temp_string);
                    break;
                }
                else{
                    temp_string += "9";
                    text.setText(temp_string);
                }
                break;

            case R.id.buttonMIN:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("")){
                    temp_string += "0-";
                    text.setText(temp_string);
                    break;
                }
                get_char = temp_string.substring(temp_string.length() - 1);
                if(temp_string.equals("INVALID")) {
                    break;
                }
                if(get_char.equals(".")){
                    temp_string+="0";
                }
                if(get_char.equals("-") || get_char.equals("+") || get_char.equals("*") || get_char.equals("/")){
                    temp_string = "INVALID";
                }
                else{
                    temp_string += "-";
                }
                text.setText(temp_string);
                break;
            case R.id.buttonPLUS:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                get_char = temp_string.substring(temp_string.length() - 1);
                if(temp_string.equals("INVALID")) {
                    break;
                }
                if(get_char.equals(".")){
                    temp_string+="0";
                }
                if(get_char.equals("-") || get_char.equals("+") || get_char.equals("*") || get_char.equals("/")){
                    temp_string = "INVALID";
                }
                else{
                    temp_string += "+";
                }
                text.setText(temp_string);
                break;
            case R.id.buttonMOD:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    break;
                }
                else{
                    int i=0;
                    while (i<(temp_string.length())) {
                        char c = temp_string.charAt(i);
                        if((c == '-') || (c=='+') || (c=='*') || (c=='/')){
                            temp_string = "INVALID";
                            break;
                        }
                        i++;
                    }
                    if(temp_string.equals("INVALID")) {
                        text.setText(temp_string);
                        break;
                    }
                    else {
                        temp_string_value = Double.valueOf(temp_string);
                        temp_string_value /= 100;
                        temp_string = String.valueOf(temp_string_value);
                        text.setText(temp_string);
                    }
                }
                break;
            case R.id.buttonDIV:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                get_char = temp_string.substring(temp_string.length() - 1);
                if(temp_string.equals("INVALID")) {
                    break;
                }
                if(get_char.equals(".")){
                    temp_string+="0";
                }
                if(get_char.equals("-") || get_char.equals("+") || get_char.equals("*") || get_char.equals("/")){
                    temp_string = "INVALID";
                }
                else{
                    temp_string += "/";
                }
                text.setText(temp_string);
                break;
            case R.id.buttonMULT:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                get_char = temp_string.substring(temp_string.length() - 1);
                if(temp_string.equals("INVALID")) {
                    break;
                }
                if(get_char.equals(".")){
                    temp_string+="0";
                }
                if(get_char.equals("-") || get_char.equals("+") || get_char.equals("*") || get_char.equals("/")){
                    temp_string = "INVALID";
                }
                else{
                    temp_string += "*";
                }
                text.setText(temp_string);
                break;
            case R.id.buttonDEC:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                if(temp_string.equals("INVALID")) {
                    break;
                }
                else {
                    get_char = temp_string.substring(temp_string.length() - 1);
                    if(get_char.equals("-") || get_char.equals("+") || get_char.equals("*") || get_char.equals("/")){
                        temp_string += "0";
                    }
                    temp_string += ".";
                    text.setText(temp_string);
                }
                break;
            case R.id.buttonEQUALS:
                temp_char = text.getText();
                temp_string = String.valueOf(temp_char);
                String add_sub_array[];
                String mult_div_array[];
                if(temp_string.substring(0, 1).equals("-")){
                    temp_string = "@" + temp_string.substring(1,temp_string.length());
                }
                add_sub_array = temp_string.split("(?=[+-])|(?<=[+-])");
                i = 0;
                while(i < add_sub_array.length){
                    temp_string2 = add_sub_array[i];
                    mult_div_array = temp_string2.split("(?=[*/])|(?<=[*/])");
                    j = 0;
                    while(j < mult_div_array.length){
                        if(mult_div_array[j].equals("*")){
                            if(mult_div_array[j-1].substring(0,1).equals("@")){
                                mult_div_array[j-1] = "-" + mult_div_array[j-1].substring(1, mult_div_array[j-1].length());
                            }
                            first_num = Double.valueOf(mult_div_array[j-1]);
                            second_num = Double.valueOf(mult_div_array[j+1]);
                            result = first_num * second_num;
                            str_result = String.valueOf(result);
                            mult_div_array[j+1] = str_result;
                            add_sub_array[i] = str_result;
                        }
                        if(mult_div_array[j].equals("/")){
                            if(mult_div_array[j-1].substring(0,1).equals("@")){
                                mult_div_array[j-1] = "-" + mult_div_array[j-1].substring(1, mult_div_array[j-1].length());
                            }
                            first_num = Double.valueOf(mult_div_array[j-1]);
                            second_num = Double.valueOf(mult_div_array[j+1]);
                            result = first_num / second_num;
                            str_result = String.valueOf(result);
                            mult_div_array[j+1] = str_result;
                            add_sub_array[i] = str_result;
                        }
                        j++;
                    }
                    i++;
                }
                i = 0;
                result = 0.0;
                text.setText(Arrays.toString(add_sub_array));
                while(i < add_sub_array.length){
                        if(add_sub_array[i].equals("+")){
                            if(add_sub_array[i-1].substring(0,1).equals("@")){
                                add_sub_array[i-1] = "-" + add_sub_array[i-1].substring(1, add_sub_array[i-1].length());
                            }
                            first_num = Double.valueOf(add_sub_array[i-1]);
                            second_num = Double.valueOf(add_sub_array[i+1]);
                            result = first_num + second_num;
                            str_result = String.valueOf(result);
                            add_sub_array[i+1] = str_result;
                        }
                        if(add_sub_array[i].equals("-")){
                            if(add_sub_array[i-1].substring(0,1).equals("@")){
                                add_sub_array[i-1] = "-" + add_sub_array[i-1].substring(1, add_sub_array[i-1].length());
                            }
                            first_num = Double.valueOf(add_sub_array[i-1]);
                            second_num = Double.valueOf(add_sub_array[i+1]);
                            result = first_num - second_num;
                            str_result = String.valueOf(result);
                            add_sub_array[i+1] = str_result;
                        }
                    i++;
                }
                if(add_sub_array.length == 1){
                    result = Double.valueOf(add_sub_array[0]);
                }
                str_result = dcformat.format(result);
                text.setText(str_result);
                break;
        }
    }
}
