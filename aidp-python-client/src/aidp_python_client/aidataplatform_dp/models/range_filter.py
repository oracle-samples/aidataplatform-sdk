# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class RangeFilter(object):
    """
    Range filters
    """

    #: A constant which can be used with the field property of a RangeFilter.
    #: This constant has a value of "TIME_UPDATED"
    FIELD_TIME_UPDATED = "TIME_UPDATED"

    #: A constant which can be used with the field property of a RangeFilter.
    #: This constant has a value of "TIME_CREATED"
    FIELD_TIME_CREATED = "TIME_CREATED"

    #: A constant which can be used with the data_type property of a RangeFilter.
    #: This constant has a value of "STRING"
    DATA_TYPE_STRING = "STRING"

    #: A constant which can be used with the data_type property of a RangeFilter.
    #: This constant has a value of "DATE"
    DATA_TYPE_DATE = "DATE"

    #: A constant which can be used with the data_type property of a RangeFilter.
    #: This constant has a value of "INTEGER"
    DATA_TYPE_INTEGER = "INTEGER"

    def __init__(self, **kwargs):
        """
        Initializes a new RangeFilter object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param field:
            The value to assign to the field property of this RangeFilter.
            Allowed values for this property are: "TIME_UPDATED", "TIME_CREATED"
        :type field: str

        :param data_type:
            The value to assign to the data_type property of this RangeFilter.
            Allowed values for this property are: "STRING", "DATE", "INTEGER"
        :type data_type: str

        :param start:
            The value to assign to the start property of this RangeFilter.
        :type start: str

        :param end:
            The value to assign to the end property of this RangeFilter.
        :type end: str

        """
        self.swagger_types = {
            'field': 'str',
            'data_type': 'str',
            'start': 'str',
            'end': 'str'
        }

        self.attribute_map = {
            'field': 'field',
            'data_type': 'dataType',
            'start': 'start',
            'end': 'end'
        }

        self._field = None
        self._data_type = None
        self._start = None
        self._end = None

    @property
    def field(self):
        """
        Gets the field of this RangeFilter.
        Field Name for range filter

        Allowed values for this property are: "TIME_UPDATED", "TIME_CREATED"


        :return: The field of this RangeFilter.
        :rtype: str
        """
        return self._field

    @field.setter
    def field(self, field):
        """
        Sets the field of this RangeFilter.
        Field Name for range filter


        :param field: The field of this RangeFilter.
        :type: str
        """
        allowed_values = ["TIME_UPDATED", "TIME_CREATED"]
        if not value_allowed_none_or_none_sentinel(field, allowed_values):
            raise ValueError(
                "Invalid value for `field`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._field = field

    @property
    def data_type(self):
        """
        Gets the data_type of this RangeFilter.
        Field Name data type

        Allowed values for this property are: "STRING", "DATE", "INTEGER"


        :return: The data_type of this RangeFilter.
        :rtype: str
        """
        return self._data_type

    @data_type.setter
    def data_type(self, data_type):
        """
        Sets the data_type of this RangeFilter.
        Field Name data type


        :param data_type: The data_type of this RangeFilter.
        :type: str
        """
        allowed_values = ["STRING", "DATE", "INTEGER"]
        if not value_allowed_none_or_none_sentinel(data_type, allowed_values):
            raise ValueError(
                "Invalid value for `data_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._data_type = data_type

    @property
    def start(self):
        """
        Gets the start of this RangeFilter.
        Start value


        :return: The start of this RangeFilter.
        :rtype: str
        """
        return self._start

    @start.setter
    def start(self, start):
        """
        Sets the start of this RangeFilter.
        Start value


        :param start: The start of this RangeFilter.
        :type: str
        """
        self._start = start

    @property
    def end(self):
        """
        Gets the end of this RangeFilter.
        End value


        :return: The end of this RangeFilter.
        :rtype: str
        """
        return self._end

    @end.setter
    def end(self, end):
        """
        Sets the end of this RangeFilter.
        End value


        :param end: The end of this RangeFilter.
        :type: str
        """
        self._end = end

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
