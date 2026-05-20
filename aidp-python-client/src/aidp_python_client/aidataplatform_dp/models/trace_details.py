# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class TraceDetails(object):
    """
    Trace object
    """

    def __init__(self, **kwargs):
        """
        Initializes a new TraceDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param trace_id:
            The value to assign to the trace_id property of this TraceDetails.
        :type trace_id: str

        :param parent_session_id:
            The value to assign to the parent_session_id property of this TraceDetails.
        :type parent_session_id: str

        :param spans:
            The value to assign to the spans property of this TraceDetails.
        :type spans: list[oci.aidataplatform_dp.models.SpanDetails]

        :param start_time:
            The value to assign to the start_time property of this TraceDetails.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this TraceDetails.
        :type end_time: int

        :param resources:
            The value to assign to the resources property of this TraceDetails.
        :type resources: dict(str, object)

        """
        self.swagger_types = {
            'trace_id': 'str',
            'parent_session_id': 'str',
            'spans': 'list[SpanDetails]',
            'start_time': 'int',
            'end_time': 'int',
            'resources': 'dict(str, object)'
        }

        self.attribute_map = {
            'trace_id': 'traceId',
            'parent_session_id': 'parentSessionId',
            'spans': 'spans',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'resources': 'resources'
        }

        self._trace_id = None
        self._parent_session_id = None
        self._spans = None
        self._start_time = None
        self._end_time = None
        self._resources = None

    @property
    def trace_id(self):
        """
        **[Required]** Gets the trace_id of this TraceDetails.
        trace id


        :return: The trace_id of this TraceDetails.
        :rtype: str
        """
        return self._trace_id

    @trace_id.setter
    def trace_id(self, trace_id):
        """
        Sets the trace_id of this TraceDetails.
        trace id


        :param trace_id: The trace_id of this TraceDetails.
        :type: str
        """
        self._trace_id = trace_id

    @property
    def parent_session_id(self):
        """
        **[Required]** Gets the parent_session_id of this TraceDetails.
        session id


        :return: The parent_session_id of this TraceDetails.
        :rtype: str
        """
        return self._parent_session_id

    @parent_session_id.setter
    def parent_session_id(self, parent_session_id):
        """
        Sets the parent_session_id of this TraceDetails.
        session id


        :param parent_session_id: The parent_session_id of this TraceDetails.
        :type: str
        """
        self._parent_session_id = parent_session_id

    @property
    def spans(self):
        """
        **[Required]** Gets the spans of this TraceDetails.
        collections of spans


        :return: The spans of this TraceDetails.
        :rtype: list[oci.aidataplatform_dp.models.SpanDetails]
        """
        return self._spans

    @spans.setter
    def spans(self, spans):
        """
        Sets the spans of this TraceDetails.
        collections of spans


        :param spans: The spans of this TraceDetails.
        :type: list[oci.aidataplatform_dp.models.SpanDetails]
        """
        self._spans = spans

    @property
    def start_time(self):
        """
        **[Required]** Gets the start_time of this TraceDetails.
        startTime


        :return: The start_time of this TraceDetails.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this TraceDetails.
        startTime


        :param start_time: The start_time of this TraceDetails.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        **[Required]** Gets the end_time of this TraceDetails.
        endTime


        :return: The end_time of this TraceDetails.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this TraceDetails.
        endTime


        :param end_time: The end_time of this TraceDetails.
        :type: int
        """
        self._end_time = end_time

    @property
    def resources(self):
        """
        Gets the resources of this TraceDetails.
        Map of properties


        :return: The resources of this TraceDetails.
        :rtype: dict(str, object)
        """
        return self._resources

    @resources.setter
    def resources(self, resources):
        """
        Sets the resources of this TraceDetails.
        Map of properties


        :param resources: The resources of this TraceDetails.
        :type: dict(str, object)
        """
        self._resources = resources

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
