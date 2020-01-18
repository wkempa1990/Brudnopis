import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import  java.util.Map;

public class ZadaniaZbiory {
    public static void main(String[] args) {
        Set<String> znaki = new HashSet<>();
        Set<Character>znaki2 = new HashSet<>();//do zadania 2
        Map<String, Integer> mapa = new HashMap<>();//zadanie 4
        Map<Character,Integer>znaki3 = new HashMap<>();
        String tekst = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam mollis tincidunt venenatis. Proin imperdiet, lectus quis feugiat pretium, eros dui viverra nisl, ac facilisis mauris felis ac augue. Cras facilisis magna ante, eu cursus felis auctor ut. Ut ut ligula ipsum. Sed condimentum interdum diam. Vestibulum quis odio at odio dignissim rhoncus. Curabitur erat est, sagittis quis dignissim vel, lacinia congue lacus. Sed porta ornare massa. Nam vestibulum elit felis, sodales tristique urna vehicula et. Etiam sed venenatis leo. Sed eros nibh, rutrum id leo nec, facilisis varius ex. Mauris fermentum, magna ut pharetra pulvinar, dolor eros dictum felis, eu aliquam orci leo eget ipsum.\n" +
                "\n" +
                "Suspendisse vel ipsum a quam iaculis hendrerit id sit amet nibh. Nullam scelerisque dignissim eros ut feugiat. Aenean cursus, nisl eget porta porta, lectus metus condimentum tellus, sit amet molestie risus mauris eu quam. Cras a libero eget dui accumsan laoreet. Sed id urna sit amet sem fermentum pellentesque. Praesent rhoncus mi eu maximus ullamcorper. Praesent imperdiet sit amet enim in finibus. Cras ornare ipsum sit amet sem laoreet, tincidunt tristique massa hendrerit. Cras interdum tellus nec ex fringilla facilisis in in elit. Nullam malesuada libero id nisi sollicitudin viverra. Mauris finibus lobortis augue, sit amet condimentum sapien mollis vel.\n" +
                "\n" +
                "Vestibulum iaculis felis et urna ultricies, eget convallis ex volutpat. Aenean ipsum elit, ornare id mattis et, fermentum ac orci. Curabitur facilisis ante aliquam velit feugiat, nec fringilla elit mollis. Etiam vel semper eros, vel bibendum nibh. Praesent vestibulum dolor eget lacus tempus dictum. Nulla placerat tincidunt convallis. Aliquam aliquet dolor diam, vitae congue felis sodales ac.\n" +
                "\n" +
                "Nullam venenatis neque a nulla commodo, non porta augue pulvinar. Nulla egestas ipsum diam, id ornare sapien tincidunt vel. Proin quis leo magna. Morbi scelerisque maximus feugiat. Donec dignissim neque cursus sagittis aliquam. Morbi id aliquam est, id vulputate odio. Morbi rhoncus ultricies nisi at maximus. Nam ut lectus eu orci volutpat fermentum eget sodales libero. Duis tempus ornare urna, id rhoncus augue venenatis in. Cras vestibulum neque ut viverra mattis.\n" +
                "\n" +
                "Etiam quis tellus gravida sem convallis faucibus. Suspendisse in sapien orci. Phasellus sed ultricies nunc, a fringilla lorem. Aenean tristique gravida egestas. Cras ut tempus libero, eu aliquam libero. Ut vitae nisl eros. Aliquam congue finibus mauris eget aliquam. Proin mattis, odio eget sollicitudin feugiat, felis mi ornare justo, eu elementum risus sapien ut leo. In hac habitasse platea dictumst. Morbi a tempor erat. Integer ultricies ornare nulla, at hendrerit dolor. Etiam lacus augue, euismod sed sollicitudin a, posuere vel massa. Sed facilisis placerat tortor ut tempus. Sed tincidunt, velit eget faucibus mattis, mauris dui lobortis lorem, at bibendum lacus nibh nec augue. Etiam neque felis, convallis a mi placerat, elementum porta felis.";


        String[] slowa = tekst.split("\\s*[^a-zA-Z]+\\s*"); //moze byc //W - sam w cudzyslowiu
        int n = slowa.length;
        for (int i = 0; i < n; i++) {
            znaki.add(slowa[i]);
        }
        System.out.println(znaki.size());

                    //Zadanie 2
        char[] slowa1 = tekst.toCharArray(); //moze byc //W - sam w cudzyslowiu
        int b = slowa1.length;
        for (int i = 0; i < b; i++) {
            znaki2.add(slowa1[i]);
        }
        System.out.println(znaki2.size());

        for (int k=0; k< slowa1.length;k++) {
            znaki3.put(slowa1[k], 0);
        }
        for (int k=0; k< slowa1.length;k++) {
            int wartosc = znaki3.get(slowa1[k]);
            znaki3.put(slowa1[k], ++wartosc);
        }
        Set<Map.Entry<String, Integer>> entrySet1 = mapa.entrySet();
        System.out.println(entrySet1);



        //Zadanie 4
        for (int k=0; k< slowa.length;k++) {
            mapa.put(slowa[k], 0);
        }
        for (int k=0; k< slowa.length;k++) {
            int wartosc = mapa.get(slowa[k]);
            mapa.put(slowa[k], ++wartosc);
        }
        Set<Map.Entry<String, Integer>> entrySet = mapa.entrySet();
        System.out.println(entrySet);

    }


}
