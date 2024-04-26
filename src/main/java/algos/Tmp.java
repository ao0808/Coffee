//package algos;
//
//import ru.sbrf.coffee.listingOfOrderParameters.VolumeOfCup;
//import ru.sbrf.coffee.model.Order;
//
//import java.util.*;
//
//public class Tmp {
//    public static void main(String[] args){
//        // факториал
////        int x = 5;
////        int i = 1;
////        int res = 1;
////        while (i <= x){
////            res = res * (i);
////            i++;
////        }
////        System.out.println(res);
//        // фибаначи
////        int n = 44;
////        int [] fib = new int[n];
////        fib [0] = 0;
////        fib [1] = 1;
////        for (int i = 2; i < n; i++){
////            fib[i] = fib[i-2] + fib[i-1];
////        }
////        System.out.println(Arrays.toString(fib));
//
////        import java.util.Arrays;
////
////        public class QuickSort {
////            public static void main(String[] args) {
////                int[] array = {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};
////                System.out.println("Unsorted Array: " + Arrays.toString(array));
////                quickSort(array, 0, array.length - 1);
////                System.out.println(" Sorted Array: " + Arrays.toString(array));
////            }
////
////            public static void quickSort(int[] arr, int low, int high) {
////                if (low < high) {
////                    int pi = partition(arr, low, high);
////
////                    quickSort(arr, low, pi - 1);
////                    quickSort(arr, pi + 1, high);
////                }
////            }
////
////            private static int partition(int[] arr, int low, int high) {
////                int pivot = arr[high];
////                int i = (low - 1);
////                for (int j = low; j < high; j++) {
////                    if (arr[j] < pivot) {
////                        i++;
////
////                        int temp = arr[i];
////                        arr[i] = arr[j];
////                        arr[j] = temp;
////                    }
////                }
////
////                int temp = arr[i + 1];
////                arr[i + 1] = arr[high];
////                arr[high] = temp;
////
////                return i + 1;
////            }
////        }
////        public class Person {
////            private String lastName;
////            private String firstName;
////
////            public Person(
////                    String lastName,
////                    String firstName
////            ) {
////                this.lastName = lastName;
////                this.firstName = firstName;
////            }
////
////            public String getFullName() {
////                if (lastName == null || firstName == null)
////                    throw new NullPointerException("Имя и фамилия обязательны для заполнения");
////                return firstName + " " + lastName;
////            }
////
////            public String sayWord(String word) {
////                try {
////                    if (word == null)
////                        throw new ExecutionException("Параметр 'word' обязательный");
////                    return getFullName() + " say " + word;
////                } catch(ExecutionException e) {
////                    return getFullName() + " say no word";
////                }
////            }
////
////            public String doAction(String action) {
////                try {
////                    if (action == null)
////                        throw new ExecutionException("Параметр 'action' обязательный");
////                    return "action " + action + " success";
////                } catch (Exception e) {
////                    return "action " + action + " failed";
////                } finally {
////                    return "action " + action + " done";
////                }
////            }
////        }
//
//        Map<String, Integer> map = new HashMap();
//        List<String> list = new LinkedList();
//        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
//        list.add(0, "ssss");
//        list.sort();
//        int [] array = new int[10];
//        map.put("Sasha", 135000);
//        System.out.println(map.containsKey("Sasha"));
//        System.out.println(map.isEmpty());
//        System.out.println(map);
//        map.
//
//    }
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Order order = (Order) obj;
//        return Objects.equals(this.getVolumeOfCup(), order.getVolumeOfCup()) &&
//                Objects.equals(typeOfCoffee, order.getTypeOfCoffee());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(volumeOfCup, typeOfCoffee);
//    }
//}
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(100, 500, "000dfghjkl");
//    }
//}
