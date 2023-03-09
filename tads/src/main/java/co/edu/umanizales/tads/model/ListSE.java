package co.edu.umanizales.tads.model;

import lombok.Data;

@Data
public class ListSE {
    private Node head;

    public void add(Kid kid){
        if(head != null){
            Node temp =head;
            while(temp.getNext()!=null)
            {

                temp =temp.getNext();
            }
            // para en el ultimo
            Node newNode = new Node(kid);
            temp.setNext(newNode);
        }
        else{
            head= new Node(kid);
        }
    }
    public void addToStart(Kid kid){
        if(head !=null)
        {
            Node newNode = new Node(kid);
            newNode.setNext(head);
            head = newNode;
        }
        else {
            head = new Node(kid);
        }


        }
    //metodo para añadir nuevo nodo y nuevo niño en un posicion
    public void addInpos(Kid kid, int pos){
        Node temp = head;
        for (int i=0; i<pos;i++){
            temp= temp.getNext();
        }
        Node newNode = new Node(kid);
        temp.setNext(newNode);
    }
    //metodo para eliminar niños recibiendo el id
    public void deleteKid(String id){
        Node temp=head;
        while(!temp.getNext().getData().getId().equals(id)){
            temp= temp.getNext();
        }
        temp.getNext().setData(null);
    }

}
