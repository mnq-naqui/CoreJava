//Program 140 Lara material return statement with try catch n finally
package com.lara;

public class D {
	int test1() {
		try {

		} catch (Exception e) {
			// TODO: handle exception
		} finally {

		}
		return 12;
	}

	int test2() {
		try {
			// some stmts
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			return 13;
		}

	}

	
	  /*int test3() { 
		  try {
		  }
	  
	   catch (Exception e)
	   { System.out.println(e); }
	  finally {
	   return 14;
	    } return 12;
	    }*/
	 
	int test4() {
		try {

		} catch (Exception e) {
			return 15;
		} finally {

		}
		return 12;
	}
	/*
	 * int test5() { try { //some stmts return 23; } catch (Exception e) {
	 * return 34; } finally {
	 * 
	 * } return 12; }
	 */
	/*
	 * int test6() { try { //some stmts return 56; } catch (Exception e) {
	 * return 23; } finally { return 45; } return 12; }
	 */

}
