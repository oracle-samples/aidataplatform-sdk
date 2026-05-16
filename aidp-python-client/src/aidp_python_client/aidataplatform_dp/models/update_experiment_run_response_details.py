# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateExperimentRunResponseDetails(object):
    """
    Details of updated run info.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateExperimentRunResponseDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_info:
            The value to assign to the run_info property of this UpdateExperimentRunResponseDetails.
        :type run_info: oci.aidataplatform_dp.models.ExperimentRunInfo

        """
        self.swagger_types = {
            'run_info': 'ExperimentRunInfo'
        }

        self.attribute_map = {
            'run_info': 'run_info'
        }

        self._run_info = None

    @property
    def run_info(self):
        """
        **[Required]** Gets the run_info of this UpdateExperimentRunResponseDetails.

        :return: The run_info of this UpdateExperimentRunResponseDetails.
        :rtype: oci.aidataplatform_dp.models.ExperimentRunInfo
        """
        return self._run_info

    @run_info.setter
    def run_info(self, run_info):
        """
        Sets the run_info of this UpdateExperimentRunResponseDetails.

        :param run_info: The run_info of this UpdateExperimentRunResponseDetails.
        :type: oci.aidataplatform_dp.models.ExperimentRunInfo
        """
        self._run_info = run_info

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
