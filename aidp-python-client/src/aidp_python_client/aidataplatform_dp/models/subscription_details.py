# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SubscriptionDetails(object):
    """
    Details of subscription.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SubscriptionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param callback_url:
            The value to assign to the callback_url property of this SubscriptionDetails.
        :type callback_url: str

        :param service_name:
            The value to assign to the service_name property of this SubscriptionDetails.
        :type service_name: str

        """
        self.swagger_types = {
            'callback_url': 'str',
            'service_name': 'str'
        }

        self.attribute_map = {
            'callback_url': 'callbackUrl',
            'service_name': 'serviceName'
        }

        self._callback_url = None
        self._service_name = None

    @property
    def callback_url(self):
        """
        Gets the callback_url of this SubscriptionDetails.
        The notification callback URL.


        :return: The callback_url of this SubscriptionDetails.
        :rtype: str
        """
        return self._callback_url

    @callback_url.setter
    def callback_url(self, callback_url):
        """
        Sets the callback_url of this SubscriptionDetails.
        The notification callback URL.


        :param callback_url: The callback_url of this SubscriptionDetails.
        :type: str
        """
        self._callback_url = callback_url

    @property
    def service_name(self):
        """
        Gets the service_name of this SubscriptionDetails.
        The name of the service.


        :return: The service_name of this SubscriptionDetails.
        :rtype: str
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name):
        """
        Sets the service_name of this SubscriptionDetails.
        The name of the service.


        :param service_name: The service_name of this SubscriptionDetails.
        :type: str
        """
        self._service_name = service_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
