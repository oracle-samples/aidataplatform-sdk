# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class InferenceInvocationSummaryResponse(object):
    """
    Aggregate metrics for a model deployment's inference invocations.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new InferenceInvocationSummaryResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_start:
            The value to assign to the time_start property of this InferenceInvocationSummaryResponse.
        :type time_start: datetime

        :param time_end:
            The value to assign to the time_end property of this InferenceInvocationSummaryResponse.
        :type time_end: datetime

        :param summary:
            The value to assign to the summary property of this InferenceInvocationSummaryResponse.
        :type summary: oci.aidataplatform_dp.models.InferenceInvocationSummaryMetrics

        """
        self.swagger_types = {
            'time_start': 'datetime',
            'time_end': 'datetime',
            'summary': 'InferenceInvocationSummaryMetrics'
        }
        self.attribute_map = {
            'time_start': 'timeStart',
            'time_end': 'timeEnd',
            'summary': 'summary'
        }
        self._time_start = None
        self._time_end = None
        self._summary = None

    @property
    def time_start(self):
        """
        **[Required]** Gets the time_start of this InferenceInvocationSummaryResponse.
        Inclusive start time resolved for this summary query.


        :return: The time_start of this InferenceInvocationSummaryResponse.
        :rtype: datetime
        """
        return self._time_start

    @time_start.setter
    def time_start(self, time_start):
        """
        Sets the time_start of this InferenceInvocationSummaryResponse.
        Inclusive start time resolved for this summary query.


        :param time_start: The time_start of this InferenceInvocationSummaryResponse.
        :type: datetime
        """
        self._time_start = time_start

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this InferenceInvocationSummaryResponse.
        Inclusive end time resolved for this summary query.


        :return: The time_end of this InferenceInvocationSummaryResponse.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this InferenceInvocationSummaryResponse.
        Inclusive end time resolved for this summary query.


        :param time_end: The time_end of this InferenceInvocationSummaryResponse.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def summary(self):
        """
        **[Required]** Gets the summary of this InferenceInvocationSummaryResponse.

        :return: The summary of this InferenceInvocationSummaryResponse.
        :rtype: oci.aidataplatform_dp.models.InferenceInvocationSummaryMetrics
        """
        return self._summary

    @summary.setter
    def summary(self, summary):
        """
        Sets the summary of this InferenceInvocationSummaryResponse.

        :param summary: The summary of this InferenceInvocationSummaryResponse.
        :type: oci.aidataplatform_dp.models.InferenceInvocationSummaryMetrics
        """
        self._summary = summary

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
