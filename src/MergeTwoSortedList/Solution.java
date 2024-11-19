package MergeTwoSortedList;

class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		//Crea una lista imaginaria como referencia
		ListNode imaginaria = new ListNode(-1);
		//Le damos valor imaginaria para trabajar con ella mas facilmente
		ListNode valor = imaginaria;

		//Mientas list1 y list2 esten vacios sigue el bucle
		while (list1 != null && list2 != null) {
			//Si list1 es mayor que list2 añade primero el valor de list1 sino el de list2
			if (list1.val <= list2.val) {
				valor.next = list1;
				list1 = list1.next;
			} else {
				valor.next = list2;
				list2 = list2.next;
			}
			//Vamos al siguiente valor
			valor = valor.next;
		}

		//Si cuando no es null y el otro si añade tambien ese valor
		if (list1 != null) {
			valor.next = list1;
		} else {
			valor.next = list2;
		}

		//Devuelve todos los valores de .next
		return imaginaria.next;
	}
}