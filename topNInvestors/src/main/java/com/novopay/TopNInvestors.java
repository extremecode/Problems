package com.novopay;

import java.util.List;

public interface TopNInvestors {
    TopNInvestors add(Investor investor);
    List<Investor> get(int n);
}
