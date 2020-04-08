package com.logixode.rk.circularlinkedlist;

/** Proses utama CircularLinkedList
 * @author Rohmad Kurniadi
 */
public class CircularLinkedList {
    private Node first;
    private Node last;
    
    /** Class Constructor
     *  reset first & last
     */
    public CircularLinkedList() {
        first = null;
        last = null;
    }
    
    /** Method untuk menambahkan data ke awal List
     * @param data int  value untuk ditambahkan
     * @return void
     */
    public void insertFirst( int data ) {
        Node newNode = new Node();
        newNode.data = data;
        
        if( isEmpty() ) {
            last = newNode;
        }
        
        newNode.next = first;
        first = newNode;
    }
    
    /** Method untuk menambahkan data ke akhir list
     * @param data int  value untuk ditambahkan
     * @return void
     */
    public void insertLast( int data ) {
        Node newNode = new Node();
        newNode.data = data;
        
        if ( isEmpty() ) {
            first = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
    }
    
    /** Function untuk manghapus data yang berada di awal List
     * @return Node alamat memory variable fisrt
     */
    public int deleteFirst() {
        int temp = first.data;
        
        if( first.next == null) {
            last = null;
        }
        
        first = first.next;
        return temp;
    }
    
    /** Method untuk menampilkan List
     * @return void
     */
    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        
        while( current != null ) {
            current.displayNode();
            current = current.next;
        }
        
        System.out.println();
    }
        
    /** Function untuk cek kondisi jika first kosong
     * @return boolean true atau false
     */
    private boolean isEmpty() {
        return first == null;
    }
}
// EOF