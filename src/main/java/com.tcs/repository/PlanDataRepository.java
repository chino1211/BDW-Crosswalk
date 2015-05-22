package com.tcs.repository;

import com.tcs.model.PlanData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 716644 on 5/13/2015.
 */
public interface PlanDataRepository extends JpaRepository<PlanData, Serializable>{

    List<PlanData> findPlanByCyYearAndActive(int cyYear, int active);

    PlanData findPlanByCyYearAndActiveAndCyPbpIdAndCySegmentAndCyContractNum(int cyYear, int active, String cyPbpId, String cySegment, String cyContractNum);

}
