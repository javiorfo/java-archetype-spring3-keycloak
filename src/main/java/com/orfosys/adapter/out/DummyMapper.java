package com.orfosys.adapter.out;

import com.orfosys.domain.model.Dummy;

public class DummyMapper {

    public static Dummy entityToDomain(DummyEntity dummyEntity) {
        return new Dummy(dummyEntity.getId(), dummyEntity.getInfo());
    }

    public static DummyEntity domainToEntity(Dummy dummy) {
        return new DummyEntity(dummy.getId(), dummy.getInfo());
    }
}
