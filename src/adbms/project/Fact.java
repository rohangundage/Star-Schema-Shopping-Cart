/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adbms.project;

/**
 *
 * @author hp
 */
public class Fact {
    int cid,sid,mid,shid,items,itemsold,profit,loss;

    public Fact(int cid,int sid,int mid,int shid,int items,int itemsold,int profit,int loss) {
        
        this.cid=cid;
        this.sid=sid;
        this.mid=mid;
        this.shid=shid;
        this.items=items;
        this.itemsold=itemsold;
        this.profit=profit;
        this.loss=loss;
        
        
        
        
    }

    public int getCid() {
        return cid;
    }

    public int getSid() {
        return sid;
    }

    public int getMid() {
        return mid;
    }

    public int getShid() {
        return shid;
    }

    public int getItems() {
        return items;
    }

    public int getItemsold() {
        return itemsold;
    }

    public int getProfit() {
        return profit;
    }

    public int getLoss() {
        return loss;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setShid(int shid) {
        this.shid = shid;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public void setItemsold(int itemsold) {
        this.itemsold = itemsold;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }
    
   
    
}
