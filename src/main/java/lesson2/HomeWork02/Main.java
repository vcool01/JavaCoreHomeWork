package lesson2.HomeWork02;

import lesson2.OneOrBothRectangleSideIsNegativeException;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = {{1, 2, 5, 'a'}, {5, 9, 6, '7'}, {12, 45, 61, 85}, {6, 11, 10, 32}};


//        int [][] myArray1 = {{1,2,5,10},{5,9,6,78},{12,45,61,85},{6,11,10,32}};
//        int [][] myArray2 = {{1,2,2,10},{5,9,6,78},{12,45,61,85}};
//        double[][] myArray3 = {{1.3, 2.5, 5.0, 10.9}, {0.5, 9.2, 6.4, 78}, {12.3, 45.0, 61, 85}, {6, 11, 10, 32}, {12, 45.0, 61, 85}};
//        int[][] myArray4 = new int[3][];
//        int[][] myArray5 = new int[4][4];

//        System.out.println("myArray");
//        arraySum(myArray);
//        System.out.println("myArray1");
//        arraySum(myArray1);
//        System.out.println("myArray2");
//        arraySum(myArray2);
//        System.out.println("myArray3");
//        arraySum(myArray3);
//        System.out.println("myArray4");
//        arraySum(myArray4);
//        System.out.println("myArray5");
//        arraySum(myArray5);
//    }

//        public static void arraySum ( int[][] array) throws MyArraySizeException {
//
//            if (array.length != 4) {
//                throw new MyArraySizeException("Размер массива по i не совпадает: " + array.length);
//            }
//            int sum = 0;
//
//            for (int i = 0; i < 4; i++) {
//                if (array[i].length != 4) {
//                    throw new MyArraySizeException("Размер массива по j не совпадает: " + array[i].length);
//                }
//                for (int j = 0; j < 4; j++) {
//                    try {
//
//                        sum += (int) array[i][j];
//                    }catch ( ArithmeticException exception) {
//                        System.out.println("Исключение");
//                    }
//                }
//            }
//            System.out.println("Сумма чисел массива " + sum);
        }
        public static void typeVar(int[][] x){
        for(int i = 0; i <4; i++){
            for(int j = 0; j <4; j++){
                System.out.println("x[" + i + "][" + j + "]");
                //вот перечисленные в учебниках и курсах проверки
                //и они не работают с интами
//                System.out.println(x[i][j] instanceof int);
 //               System.out.println(x[i][j].getClass().getName());
                //все учебники, курсы и ответы на stackoverflow говорят,
                // что в джаве отсутствует возможность проверки на инт за
                // исключением написаия наколенных методов, которые реально нифига не проверяют.
                //считаю данную задачу (как впрочем и предыдущую ) некорректным ТЗ, которое требует
                // уточнения и последующей корректировки
//                я вообще не понимаю, как в строготипизированном языке можно ставить задачу,
//                которая заведомо даже не скомпилируется
            }
        }


        }

    }

