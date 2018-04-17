fun main(args: Array<String>) {
    //26,5,37,1,61,11,59,15,48,19

    var dataArray:IntArray = intArrayOf(26,5,37,1,61,11,59,15,48,19,2,8,77)

    println("排序後:")
    quickSort(0,dataArray.size - 1,dataArray)

}

fun quickSort(left:Int,right:Int,dataArray:IntArray){

    if(left > right)
        return

    var startIndex = left
    var endIndex:Int = right
    //取基準點
    var pivot:Int = dataArray[left]
    var tmp:Int


    //不成立代表此輪排序結束
    while(startIndex != endIndex) {

        //先由右往左
        while(dataArray[endIndex] >= pivot && startIndex < endIndex) {
            endIndex--
        }

        //再由左往右
        while(dataArray[startIndex] <= pivot && startIndex < endIndex){
            startIndex++
        }

        //交叉了
        if(startIndex < endIndex) {
            tmp = dataArray[startIndex]
            dataArray[startIndex] = dataArray[endIndex]
            dataArray[endIndex] = tmp
        }

    }

    //基準數歸位
    dataArray[left] = dataArray[startIndex]
    dataArray[startIndex] = pivot

    pirntAllList(dataArray)

    quickSort(left,startIndex - 1 , dataArray)

    quickSort(startIndex + 1, right , dataArray)

}

fun pirntAllList(dataArray:IntArray){
    for (element in dataArray) {
        print("$element , ")
    }
    print("\n")
    Thread.sleep(200)
}
