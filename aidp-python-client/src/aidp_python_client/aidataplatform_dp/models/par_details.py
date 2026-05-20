# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ParDetails(object):
    """
    The details of PAR URL associated with table.
    """

    #: A constant which can be used with the par_access_type property of a ParDetails.
    #: This constant has a value of "OBJECT_READ"
    PAR_ACCESS_TYPE_OBJECT_READ = "OBJECT_READ"

    #: A constant which can be used with the par_access_type property of a ParDetails.
    #: This constant has a value of "OBJECT_WRITE"
    PAR_ACCESS_TYPE_OBJECT_WRITE = "OBJECT_WRITE"

    #: A constant which can be used with the par_access_type property of a ParDetails.
    #: This constant has a value of "OBJECT_READ_WRITE"
    PAR_ACCESS_TYPE_OBJECT_READ_WRITE = "OBJECT_READ_WRITE"

    #: A constant which can be used with the par_access_type property of a ParDetails.
    #: This constant has a value of "ANY_OBJECT_WRITE"
    PAR_ACCESS_TYPE_ANY_OBJECT_WRITE = "ANY_OBJECT_WRITE"

    #: A constant which can be used with the par_access_type property of a ParDetails.
    #: This constant has a value of "ANY_OBJECT_READ"
    PAR_ACCESS_TYPE_ANY_OBJECT_READ = "ANY_OBJECT_READ"

    #: A constant which can be used with the par_access_type property of a ParDetails.
    #: This constant has a value of "ANY_OBJECT_READ_WRITE"
    PAR_ACCESS_TYPE_ANY_OBJECT_READ_WRITE = "ANY_OBJECT_READ_WRITE"

    def __init__(self, **kwargs):
        """
        Initializes a new ParDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param par_url:
            The value to assign to the par_url property of this ParDetails.
        :type par_url: str

        :param table_key:
            The value to assign to the table_key property of this ParDetails.
        :type table_key: str

        :param time_expires:
            The value to assign to the time_expires property of this ParDetails.
        :type time_expires: datetime

        :param par_access_type:
            The value to assign to the par_access_type property of this ParDetails.
            Allowed values for this property are: "OBJECT_READ", "OBJECT_WRITE", "OBJECT_READ_WRITE", "ANY_OBJECT_WRITE", "ANY_OBJECT_READ", "ANY_OBJECT_READ_WRITE", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type par_access_type: str

        """
        self.swagger_types = {
            'par_url': 'str',
            'table_key': 'str',
            'time_expires': 'datetime',
            'par_access_type': 'str'
        }

        self.attribute_map = {
            'par_url': 'parUrl',
            'table_key': 'tableKey',
            'time_expires': 'timeExpires',
            'par_access_type': 'parAccessType'
        }

        self._par_url = None
        self._table_key = None
        self._time_expires = None
        self._par_access_type = None

    @property
    def par_url(self):
        """
        **[Required]** Gets the par_url of this ParDetails.
        PAR URL of the table.


        :return: The par_url of this ParDetails.
        :rtype: str
        """
        return self._par_url

    @par_url.setter
    def par_url(self, par_url):
        """
        Sets the par_url of this ParDetails.
        PAR URL of the table.


        :param par_url: The par_url of this ParDetails.
        :type: str
        """
        self._par_url = par_url

    @property
    def table_key(self):
        """
        **[Required]** Gets the table_key of this ParDetails.
        The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.


        :return: The table_key of this ParDetails.
        :rtype: str
        """
        return self._table_key

    @table_key.setter
    def table_key(self, table_key):
        """
        Sets the table_key of this ParDetails.
        The fully qualified name of the table in the format <catalog_name>.<schema_name>.<table_name>.


        :param table_key: The table_key of this ParDetails.
        :type: str
        """
        self._table_key = table_key

    @property
    def time_expires(self):
        """
        **[Required]** Gets the time_expires of this ParDetails.
        The date and time the table was updated.


        :return: The time_expires of this ParDetails.
        :rtype: datetime
        """
        return self._time_expires

    @time_expires.setter
    def time_expires(self, time_expires):
        """
        Sets the time_expires of this ParDetails.
        The date and time the table was updated.


        :param time_expires: The time_expires of this ParDetails.
        :type: datetime
        """
        self._time_expires = time_expires

    @property
    def par_access_type(self):
        """
        **[Required]** Gets the par_access_type of this ParDetails.
        The operation that can be performed on this resource.

        Allowed values for this property are: "OBJECT_READ", "OBJECT_WRITE", "OBJECT_READ_WRITE", "ANY_OBJECT_WRITE", "ANY_OBJECT_READ", "ANY_OBJECT_READ_WRITE", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The par_access_type of this ParDetails.
        :rtype: str
        """
        return self._par_access_type

    @par_access_type.setter
    def par_access_type(self, par_access_type):
        """
        Sets the par_access_type of this ParDetails.
        The operation that can be performed on this resource.


        :param par_access_type: The par_access_type of this ParDetails.
        :type: str
        """
        allowed_values = ["OBJECT_READ", "OBJECT_WRITE", "OBJECT_READ_WRITE", "ANY_OBJECT_WRITE", "ANY_OBJECT_READ", "ANY_OBJECT_READ_WRITE"]
        if not value_allowed_none_or_none_sentinel(par_access_type, allowed_values):
            par_access_type = 'UNKNOWN_ENUM_VALUE'
        self._par_access_type = par_access_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
