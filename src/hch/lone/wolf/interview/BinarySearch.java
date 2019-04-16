package hch.lone.wolf.interview;

/**
 * @Description 二分查找
 * @Author hechunhui
 * @Created 2018/12/19 21:52
 */
public class BinarySearch {
    public static int bsearch(int[] data,int des){
        int low = 0;
        int high =data.length-1;
        while(low<=high){

            int mid = (low+high)/2;
            int datum = data[mid];
            System.out.println("datum-->"+datum);
            if (des == datum){
                return mid;
            }else if(des<datum){
                high = mid-1;
            }else{
                low= mid+1;
            }


        }
        return -1;

    }

    public static void main(String[] args) {
        int[] data = {2,3,5,8,9,10,12,15,20};
        int key = 15;
       int  position= bsearch(data,key);
        if(position == -1){
            System.out.println("查找的是"+key+",序列中没有该数！");
        }else{
            System.out.println("查找的是"+key+",找到位置为："+position);
        }
    }


}
