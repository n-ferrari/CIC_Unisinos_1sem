public class NodeInt {
    private int value;
    private NodeInt proximo;

    public NodeInt(int valor) {
        this.value = valor;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeInt getProximo() {
        return proximo;
    }

    public void setProximo(NodeInt proximo) {
        this.proximo = proximo;
    }

    public int size(){
        int size = 1;
        NodeInt aux = this;
        while(aux.getProximo() != null){
            aux = aux.getProximo();
            size++;
        }
        return size;
    }
    public void print(){
        System.out.println(this.getValue());
        NodeInt aux = this.getProximo();
        while(aux != null){
            System.out.println(aux.getValue());
            aux = aux.getProximo();
        }
    }

    public void append(int value){
        NodeInt aux = this;
        while(aux.getProximo() != null) {
            aux = aux.getProximo();
        }
        aux.setProximo(new NodeInt(value));
    }

    public int at(int index){
        if (this.size() > index){
            NodeInt aux = this;
            int count = 0;
            while(index != count) {
                aux = aux.getProximo();
                count++;
            }
            return aux.getValue();
        }else{
            return -1;
        }
    }

    public boolean has(int value) {
        NodeInt aux = this;
        while(aux != null) {
            if(aux.getValue() == value) {
                return true;
            } else{
                aux = aux.getProximo();
            }
        }
        return false;
    }

    public boolean insert(int value, int index){
        if (this.size() > index){
            NodeInt newNode = new NodeInt(value);
            NodeInt previous = this;
            if (index == 0){
                newNode.setProximo(previous);
                this.setValue(value);
                return true;
            }

            if(index > 0){
                int count = 0;
                while(index > (count + 1)){
                    previous = previous.getProximo();
                    count++;
                }
                NodeInt next = previous.getProximo();
                previous.setProximo(newNode);
                newNode.setProximo(next);
                return true;
            }
        }   return false;
    }
}