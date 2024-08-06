package com.company.test1.scheduling.selector;

import java.util.List;

import com.company.test1.scheduling.alternatives.Alternative;

/**
 * Classes implementing this interface represent a strategy of selecting a
 * single alternative to be applied at the current scheduling step.
 *
 */
public interface AlternativeSelector {

	Alternative select(List<Alternative> alternatives);

}
