public void delete(ListNode del) {
    	
  if(del==null || del.next==null) {
    		return;
  }
    	
    	del.val=del.next.val;
    	del.next=del.next.next;
}
