# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SpanDetails(object):
    """
    Span details
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SpanDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param parent_trace_id:
            The value to assign to the parent_trace_id property of this SpanDetails.
        :type parent_trace_id: str

        :param span_id:
            The value to assign to the span_id property of this SpanDetails.
        :type span_id: str

        :param parent_span_id:
            The value to assign to the parent_span_id property of this SpanDetails.
        :type parent_span_id: str

        :param start_time:
            The value to assign to the start_time property of this SpanDetails.
        :type start_time: int

        :param end_time:
            The value to assign to the end_time property of this SpanDetails.
        :type end_time: int

        :param kind:
            The value to assign to the kind property of this SpanDetails.
        :type kind: str

        :param span_name:
            The value to assign to the span_name property of this SpanDetails.
        :type span_name: str

        :param attributes:
            The value to assign to the attributes property of this SpanDetails.
        :type attributes: dict(str, object)

        :param events:
            The value to assign to the events property of this SpanDetails.
        :type events: list[oci.aidataplatform_dp.models.TraceEvent]

        :param status:
            The value to assign to the status property of this SpanDetails.
        :type status: oci.aidataplatform_dp.models.SpanStatus

        """
        self.swagger_types = {
            'parent_trace_id': 'str',
            'span_id': 'str',
            'parent_span_id': 'str',
            'start_time': 'int',
            'end_time': 'int',
            'kind': 'str',
            'span_name': 'str',
            'attributes': 'dict(str, object)',
            'events': 'list[TraceEvent]',
            'status': 'SpanStatus'
        }

        self.attribute_map = {
            'parent_trace_id': 'parentTraceId',
            'span_id': 'spanId',
            'parent_span_id': 'parentSpanId',
            'start_time': 'startTime',
            'end_time': 'endTime',
            'kind': 'kind',
            'span_name': 'spanName',
            'attributes': 'attributes',
            'events': 'events',
            'status': 'status'
        }

        self._parent_trace_id = None
        self._span_id = None
        self._parent_span_id = None
        self._start_time = None
        self._end_time = None
        self._kind = None
        self._span_name = None
        self._attributes = None
        self._events = None
        self._status = None

    @property
    def parent_trace_id(self):
        """
        **[Required]** Gets the parent_trace_id of this SpanDetails.
        trace id


        :return: The parent_trace_id of this SpanDetails.
        :rtype: str
        """
        return self._parent_trace_id

    @parent_trace_id.setter
    def parent_trace_id(self, parent_trace_id):
        """
        Sets the parent_trace_id of this SpanDetails.
        trace id


        :param parent_trace_id: The parent_trace_id of this SpanDetails.
        :type: str
        """
        self._parent_trace_id = parent_trace_id

    @property
    def span_id(self):
        """
        **[Required]** Gets the span_id of this SpanDetails.
        span id


        :return: The span_id of this SpanDetails.
        :rtype: str
        """
        return self._span_id

    @span_id.setter
    def span_id(self, span_id):
        """
        Sets the span_id of this SpanDetails.
        span id


        :param span_id: The span_id of this SpanDetails.
        :type: str
        """
        self._span_id = span_id

    @property
    def parent_span_id(self):
        """
        Gets the parent_span_id of this SpanDetails.
        parent span id


        :return: The parent_span_id of this SpanDetails.
        :rtype: str
        """
        return self._parent_span_id

    @parent_span_id.setter
    def parent_span_id(self, parent_span_id):
        """
        Sets the parent_span_id of this SpanDetails.
        parent span id


        :param parent_span_id: The parent_span_id of this SpanDetails.
        :type: str
        """
        self._parent_span_id = parent_span_id

    @property
    def start_time(self):
        """
        **[Required]** Gets the start_time of this SpanDetails.
        start time


        :return: The start_time of this SpanDetails.
        :rtype: int
        """
        return self._start_time

    @start_time.setter
    def start_time(self, start_time):
        """
        Sets the start_time of this SpanDetails.
        start time


        :param start_time: The start_time of this SpanDetails.
        :type: int
        """
        self._start_time = start_time

    @property
    def end_time(self):
        """
        **[Required]** Gets the end_time of this SpanDetails.
        end time


        :return: The end_time of this SpanDetails.
        :rtype: int
        """
        return self._end_time

    @end_time.setter
    def end_time(self, end_time):
        """
        Sets the end_time of this SpanDetails.
        end time


        :param end_time: The end_time of this SpanDetails.
        :type: int
        """
        self._end_time = end_time

    @property
    def kind(self):
        """
        **[Required]** Gets the kind of this SpanDetails.
        type of span


        :return: The kind of this SpanDetails.
        :rtype: str
        """
        return self._kind

    @kind.setter
    def kind(self, kind):
        """
        Sets the kind of this SpanDetails.
        type of span


        :param kind: The kind of this SpanDetails.
        :type: str
        """
        self._kind = kind

    @property
    def span_name(self):
        """
        **[Required]** Gets the span_name of this SpanDetails.
        span name


        :return: The span_name of this SpanDetails.
        :rtype: str
        """
        return self._span_name

    @span_name.setter
    def span_name(self, span_name):
        """
        Sets the span_name of this SpanDetails.
        span name


        :param span_name: The span_name of this SpanDetails.
        :type: str
        """
        self._span_name = span_name

    @property
    def attributes(self):
        """
        **[Required]** Gets the attributes of this SpanDetails.
        span attributes


        :return: The attributes of this SpanDetails.
        :rtype: dict(str, object)
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes):
        """
        Sets the attributes of this SpanDetails.
        span attributes


        :param attributes: The attributes of this SpanDetails.
        :type: dict(str, object)
        """
        self._attributes = attributes

    @property
    def events(self):
        """
        **[Required]** Gets the events of this SpanDetails.
        collections of trace objects


        :return: The events of this SpanDetails.
        :rtype: list[oci.aidataplatform_dp.models.TraceEvent]
        """
        return self._events

    @events.setter
    def events(self, events):
        """
        Sets the events of this SpanDetails.
        collections of trace objects


        :param events: The events of this SpanDetails.
        :type: list[oci.aidataplatform_dp.models.TraceEvent]
        """
        self._events = events

    @property
    def status(self):
        """
        **[Required]** Gets the status of this SpanDetails.

        :return: The status of this SpanDetails.
        :rtype: oci.aidataplatform_dp.models.SpanStatus
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this SpanDetails.

        :param status: The status of this SpanDetails.
        :type: oci.aidataplatform_dp.models.SpanStatus
        """
        self._status = status

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
