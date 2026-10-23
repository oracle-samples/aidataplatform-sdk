# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ImportLineageDetails(object):
    """
    Details used to submit a lineage payload for import.
    """

    #: A constant which can be used with the payload_type property of a ImportLineageDetails.
    #: This constant has a value of "OPEN_LINEAGE_RUN_EVENT"
    PAYLOAD_TYPE_OPEN_LINEAGE_RUN_EVENT = "OPEN_LINEAGE_RUN_EVENT"

    def __init__(self, **kwargs):
        """
        Initializes a new ImportLineageDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param producer_name:
            The value to assign to the producer_name property of this ImportLineageDetails.
        :type producer_name: str

        :param payload_type:
            The value to assign to the payload_type property of this ImportLineageDetails.
            Allowed values for this property are: "OPEN_LINEAGE_RUN_EVENT"
        :type payload_type: str

        :param lineage_payload:
            The value to assign to the lineage_payload property of this ImportLineageDetails.
        :type lineage_payload: str

        """
        self.swagger_types = {
            'producer_name': 'str',
            'payload_type': 'str',
            'lineage_payload': 'str'
        }
        self.attribute_map = {
            'producer_name': 'producerName',
            'payload_type': 'payloadType',
            'lineage_payload': 'lineagePayload'
        }
        self._producer_name = None
        self._payload_type = None
        self._lineage_payload = None

    @property
    def producer_name(self):
        """
        **[Required]** Gets the producer_name of this ImportLineageDetails.
        User-friendly lineage producer name.


        :return: The producer_name of this ImportLineageDetails.
        :rtype: str
        """
        return self._producer_name

    @producer_name.setter
    def producer_name(self, producer_name):
        """
        Sets the producer_name of this ImportLineageDetails.
        User-friendly lineage producer name.


        :param producer_name: The producer_name of this ImportLineageDetails.
        :type: str
        """
        self._producer_name = producer_name

    @property
    def payload_type(self):
        """
        **[Required]** Gets the payload_type of this ImportLineageDetails.
        Type of the lineage payload. Currently, `OPEN_LINEAGE_RUN_EVENT` is supported.

        Allowed values for this property are: "OPEN_LINEAGE_RUN_EVENT"


        :return: The payload_type of this ImportLineageDetails.
        :rtype: str
        """
        return self._payload_type

    @payload_type.setter
    def payload_type(self, payload_type):
        """
        Sets the payload_type of this ImportLineageDetails.
        Type of the lineage payload. Currently, `OPEN_LINEAGE_RUN_EVENT` is supported.


        :param payload_type: The payload_type of this ImportLineageDetails.
        :type: str
        """
        allowed_values = ["OPEN_LINEAGE_RUN_EVENT"]
        if not value_allowed_none_or_none_sentinel(payload_type, allowed_values):
            raise ValueError(
                f"Invalid value for `payload_type`, must be None or one of {allowed_values}"
            )
        self._payload_type = payload_type

    @property
    def lineage_payload(self):
        """
        **[Required]** Gets the lineage_payload of this ImportLineageDetails.
        Base64-encoded GZIP-compressed UTF-8 JSON array of payloads of the specified `payloadType`. The Base64-decoded GZIP payload must not exceed 5 MiB and the decompressed JSON must not exceed 50 MiB.


        :return: The lineage_payload of this ImportLineageDetails.
        :rtype: str
        """
        return self._lineage_payload

    @lineage_payload.setter
    def lineage_payload(self, lineage_payload):
        """
        Sets the lineage_payload of this ImportLineageDetails.
        Base64-encoded GZIP-compressed UTF-8 JSON array of payloads of the specified `payloadType`. The Base64-decoded GZIP payload must not exceed 5 MiB and the decompressed JSON must not exceed 50 MiB.


        :param lineage_payload: The lineage_payload of this ImportLineageDetails.
        :type: str
        """
        self._lineage_payload = lineage_payload

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
