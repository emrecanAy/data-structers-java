package com.emrecan.ozyineleme;

/**
 * @author Emrecan
 * @created 12/12/2021 - 17:08
 */
public class OzyineliCarpim {

    public int carp(int n){
        if(n == 1) return 1;
        return n * carp(n-1);
    }
}
