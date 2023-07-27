package com.qa;

import java.util.Arrays;
import java.util.Comparator;

public class Account implements Comparable<Account>
{
    String[] cardTypes;
    String sortcode;
    String acccountNumber;
    String password;

    public Account(String[] cardTypes, String sortcode, String acccountNumber, String password) {
        this.cardTypes = cardTypes;
        this.sortcode = sortcode;
        this.acccountNumber = acccountNumber;
        this.password = password;
    }

    public String[] getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(String[] cardTypes) {
        this.cardTypes = cardTypes;
    }

    public String getSortcode() {
        return sortcode;
    }

    public void setSortcode(String sortcode) {
        this.sortcode = sortcode;
    }

    public String getAcccountNumber() {
        return acccountNumber;
    }

    public void setAcccountNumber(String acccountNumber) {
        this.acccountNumber = acccountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "cardTypes=" + Arrays.toString(cardTypes) +
                ", sortcode='" + sortcode + '\'' +
                ", acccountNumber='" + acccountNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public int compareTo(Account thatAct) {
          if (Arrays.asList(this.cardTypes).contains(thatAct.cardTypes[0]))
              if (this.sortcode.equals(thatAct.sortcode))
                  if (this.acccountNumber.equals(thatAct.acccountNumber))
                      if (this.password.equals(thatAct.password)) {
                          return 0;  // Login Success
                      }
          return -1;  // Login fails
      }
                                                                            }



