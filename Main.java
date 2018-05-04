import java.util.Arrays;

public class Main {

    /*
        Each block will have a List of transactions of Previous Hash
     */

    public static void main(String[] args) {

        String[] genesisTransactions = {"Anan sent tanya 999900 bitcoin","viy finney sent 10 bitcoins to tanya"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Tanya sent 10 bitcoin to adi", "adi sent 10 bitcoin to starbucks"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Tanya sent 999 bitcoin to my mom"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }


}
