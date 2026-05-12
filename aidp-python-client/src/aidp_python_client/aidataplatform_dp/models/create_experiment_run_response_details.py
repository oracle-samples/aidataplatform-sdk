# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateExperimentRunResponseDetails(object):
    """
    Details of created run.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateExperimentRunResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run:
            The value to assign to the run property of this CreateExperimentRunResponseDetails.
        :type run: oci.aidataplatform_dp.models.ExperimentRun

        """
        self.swagger_types = {
            'run': 'ExperimentRun'
        }

        self.attribute_map = {
            'run': 'run'
        }

        self._run = None

    @property
    def run(self):
        """
        **[Required]** Gets the run of this CreateExperimentRunResponseDetails.

        :return: The run of this CreateExperimentRunResponseDetails.
        :rtype: oci.aidataplatform_dp.models.ExperimentRun
        """
        return self._run

    @run.setter
    def run(self, run):
        """
        Sets the run of this CreateExperimentRunResponseDetails.

        :param run: The run of this CreateExperimentRunResponseDetails.
        :type: oci.aidataplatform_dp.models.ExperimentRun
        """
        self._run = run

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
