long long waysToBuyPensPencils(int total, int cost1, int cost2) {
    

    long long quantity = 0;
    for(int pens=0; pens*cost1 <= total; pens++){
        quantity += ((total-(pens*cost1))/cost2)+1;
    }
   


    return quantity;

}