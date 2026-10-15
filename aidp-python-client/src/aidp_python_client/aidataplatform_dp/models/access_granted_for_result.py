# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AccessGrantedForResult(object):
    """
    Policy decision and enforcement artifacts. Null and empty values are distinct and are preserved.
    """

    #: A constant which can be used with the access property of a AccessGrantedForResult.
    #: This constant has a value of "ALLOWED"
    ACCESS_ALLOWED = "ALLOWED"

    #: A constant which can be used with the access property of a AccessGrantedForResult.
    #: This constant has a value of "DENIED"
    ACCESS_DENIED = "DENIED"

    def __init__(self, **kwargs):
        """
        Initializes a new AccessGrantedForResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param resource:
            The value to assign to the resource property of this AccessGrantedForResult.
        :type resource: oci.aidataplatform_dp.models.AccessGrantedForResource

        :param access:
            The value to assign to the access property of this AccessGrantedForResult.
            Allowed values for this property are: "ALLOWED", "DENIED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type access: str

        :param columns_to_filter:
            The value to assign to the columns_to_filter property of this AccessGrantedForResult.
        :type columns_to_filter: list[str]

        :param allowed_columns:
            The value to assign to the allowed_columns property of this AccessGrantedForResult.
        :type allowed_columns: list[str]

        :param masked_columns:
            The value to assign to the masked_columns property of this AccessGrantedForResult.
        :type masked_columns: dict(str, AccessGrantedForMaskInfo)

        :param row_predicate:
            The value to assign to the row_predicate property of this AccessGrantedForResult.
        :type row_predicate: str

        """
        self.swagger_types = {
            'resource': 'AccessGrantedForResource',
            'access': 'str',
            'columns_to_filter': 'list[str]',
            'allowed_columns': 'list[str]',
            'masked_columns': 'dict(str, AccessGrantedForMaskInfo)',
            'row_predicate': 'str'
        }
        self.attribute_map = {
            'resource': 'resource',
            'access': 'access',
            'columns_to_filter': 'columnsToFilter',
            'allowed_columns': 'allowedColumns',
            'masked_columns': 'maskedColumns',
            'row_predicate': 'rowPredicate'
        }
        self._resource = None
        self._access = None
        self._columns_to_filter = None
        self._allowed_columns = None
        self._masked_columns = None
        self._row_predicate = None

    @property
    def resource(self):
        """
        **[Required]** Gets the resource of this AccessGrantedForResult.

        :return: The resource of this AccessGrantedForResult.
        :rtype: oci.aidataplatform_dp.models.AccessGrantedForResource
        """
        return self._resource

    @resource.setter
    def resource(self, resource):
        """
        Sets the resource of this AccessGrantedForResult.

        :param resource: The resource of this AccessGrantedForResult.
        :type: oci.aidataplatform_dp.models.AccessGrantedForResource
        """
        self._resource = resource

    @property
    def access(self):
        """
        **[Required]** Gets the access of this AccessGrantedForResult.
        Lakeproxy evaluation decision, independent of permission to call this API.

        Allowed values for this property are: "ALLOWED", "DENIED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The access of this AccessGrantedForResult.
        :rtype: str
        """
        return self._access

    @access.setter
    def access(self, access):
        """
        Sets the access of this AccessGrantedForResult.
        Lakeproxy evaluation decision, independent of permission to call this API.


        :param access: The access of this AccessGrantedForResult.
        :type: str
        """
        allowed_values = ["ALLOWED", "DENIED"]
        if not value_allowed_none_or_none_sentinel(access, allowed_values):
            access = 'UNKNOWN_ENUM_VALUE'
        self._access = access

    @property
    def columns_to_filter(self):
        """
        Gets the columns_to_filter of this AccessGrantedForResult.
        Columns to filter, or null when not supplied by Lakeproxy.


        :return: The columns_to_filter of this AccessGrantedForResult.
        :rtype: list[str]
        """
        return self._columns_to_filter

    @columns_to_filter.setter
    def columns_to_filter(self, columns_to_filter):
        """
        Sets the columns_to_filter of this AccessGrantedForResult.
        Columns to filter, or null when not supplied by Lakeproxy.


        :param columns_to_filter: The columns_to_filter of this AccessGrantedForResult.
        :type: list[str]
        """
        self._columns_to_filter = columns_to_filter

    @property
    def allowed_columns(self):
        """
        Gets the allowed_columns of this AccessGrantedForResult.
        Allowed columns, or null when enrichment is unavailable.


        :return: The allowed_columns of this AccessGrantedForResult.
        :rtype: list[str]
        """
        return self._allowed_columns

    @allowed_columns.setter
    def allowed_columns(self, allowed_columns):
        """
        Sets the allowed_columns of this AccessGrantedForResult.
        Allowed columns, or null when enrichment is unavailable.


        :param allowed_columns: The allowed_columns of this AccessGrantedForResult.
        :type: list[str]
        """
        self._allowed_columns = allowed_columns

    @property
    def masked_columns(self):
        """
        Gets the masked_columns of this AccessGrantedForResult.
        Column names mapped to masking information, or null when enrichment is unavailable.


        :return: The masked_columns of this AccessGrantedForResult.
        :rtype: dict(str, AccessGrantedForMaskInfo)
        """
        return self._masked_columns

    @masked_columns.setter
    def masked_columns(self, masked_columns):
        """
        Sets the masked_columns of this AccessGrantedForResult.
        Column names mapped to masking information, or null when enrichment is unavailable.


        :param masked_columns: The masked_columns of this AccessGrantedForResult.
        :type: dict(str, AccessGrantedForMaskInfo)
        """
        self._masked_columns = masked_columns

    @property
    def row_predicate(self):
        """
        Gets the row_predicate of this AccessGrantedForResult.
        SQL row predicate verbatim, or null when not supplied.


        :return: The row_predicate of this AccessGrantedForResult.
        :rtype: str
        """
        return self._row_predicate

    @row_predicate.setter
    def row_predicate(self, row_predicate):
        """
        Sets the row_predicate of this AccessGrantedForResult.
        SQL row predicate verbatim, or null when not supplied.


        :param row_predicate: The row_predicate of this AccessGrantedForResult.
        :type: str
        """
        self._row_predicate = row_predicate

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
