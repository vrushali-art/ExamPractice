package com.nidhibank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nidhibank.entities.SavingPlan;

public interface SavingPlanRepository extends JpaRepository<SavingPlan,Long>  {

}
