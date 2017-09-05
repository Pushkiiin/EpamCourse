package classwork.lesson170701;

import classwork.lesson170629.practice.DataGen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenomeWithStrings {

    private static final int GENOME_SIZE = 300000;
    private static final int WORD_SIZE = 3;

    static class Word implements Comparable<Word>{

        byte data[];
        int offset;

        public Word(byte[] data, int offset) {
            this.data = data;
            this.offset = offset;
        }

        @Override
        public int compareTo(Word otherWord) {
            for (int i = 0; i < WORD_SIZE; i++) {
                int diff = data[offset + i] - data[otherWord.offset + i];
                if (diff != 0){
                    return diff;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("asd");
        byte[] data = DataGen.generate(GENOME_SIZE);

        //список стрингов тут - херовы план, т.к. весит
        //сделать свой объект дешевле - ??
        List<Word> list = new ArrayList<>();
        for (int i = 0; i < GENOME_SIZE - WORD_SIZE; i++) {
            list.add(new Word(data, i));
        }

        Collections.sort(list);
        //sout
    }
}