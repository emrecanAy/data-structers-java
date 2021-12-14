package com.emrecan.ozyineleme;

/**
 * @author Emrecan
 * @created 12/12/2021 - 16:53
 */
public class OzyineliUstel {

    public double ust(double a, int n){
        double araSonuc;

        if(n == 0) return 1;
        if(n == 1) return a;

        araSonuc = ust(a, n-1);
        return araSonuc * a;
    }

}
