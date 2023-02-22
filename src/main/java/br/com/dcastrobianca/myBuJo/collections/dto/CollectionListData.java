package br.com.dcastrobianca.myBuJo.collections.dto;

import br.com.dcastrobianca.myBuJo.collections.Collection;
import br.com.dcastrobianca.myBuJo.collections.CollectionType;

public record CollectionListData(String name, CollectionType type) {
    public CollectionListData(Collection collation){
        this(collation.getName(), collation.getType());
    }
}
